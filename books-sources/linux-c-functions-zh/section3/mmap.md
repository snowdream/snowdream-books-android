mmap（建立内存映射）
相关函数
munmap，open
表头文件
#include <unistd.h>
#include <sys/mman.h>
定义函数
void *mmap(void *start,size_t length,int prot,int flags,int fd,off_t offsize);
函数说明
mmap()用来将某个文件内容映射到内存中，对该内存区域的存取即是直接对该文件内容的读写。参数start指向欲对应的内存起始地址，通常设为NULL，代表让系统自动选定地址，对应成功后该地址会返回。参数length代表将文件中多大的部分对应到内存。
参数
prot代表映射区域的保护方式有下列组合
PROT_EXEC 映射区域可被执行
PROT_READ 映射区域可被读取
PROT_WRITE 映射区域可被写入
PROT_NONE 映射区域不能存取
参数
flags会影响映射区域的各种特性
MAP_FIXED 如果参数start所指的地址无法成功建立映射时，则放弃映射，不对地址做修正。通常不鼓励用此旗标。
MAP_SHARED对映射区域的写入数据会复制回文件内，而且允许其他映射该文件的进程共享。
MAP_PRIVATE 对映射区域的写入操作会产生一个映射文件的复制，即私人的“写入时复制”（copy on write）对此区域作的任何修改都不会写回原来的文件内容。
MAP_ANONYMOUS建立匿名映射。此时会忽略参数fd，不涉及文件，而且映射区域无法和其他进程共享。
MAP_DENYWRITE只允许对映射区域的写入操作，其他对文件直接写入的操作将会被拒绝。
MAP_LOCKED 将映射区域锁定住，这表示该区域不会被置换（swap）。
在调用mmap()时必须要指定MAP_SHARED 或MAP_PRIVATE。参数fd为open()返回的文件描述词，代表欲映射到内存的文件。参数offset为文件映射的偏移量，通常设置为0，代表从文件最前方开始对应，offset必须是分页大小的整数倍。
返回值
若映射成功则返回映射区的内存起始地址，否则返回MAP_FAILED(－1)，错误原因存于errno 中。
错误代码
EBADF 参数fd 不是有效的文件描述词
EACCES 存取权限有误。如果是MAP_PRIVATE 情况下文件必须可读，使用MAP_SHARED则要有PROT_WRITE以及该文件要能写入。
EINVAL 参数start、length 或offset有一个不合法。
EAGAIN 文件被锁住，或是有太多内存被锁住。
ENOMEM 内存不足。
范例
/* 利用mmap()来读取/etc/passwd 文件内容*/
#include<sys/types.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/mman.h>
main()
{
int fd;
void *start;
struct stat sb;
fd=open(“/etc/passwd”,O_RDONLY); /*打开/etc/passwd*/
fstat(fd,&sb); /*取得文件大小*/
start=mmap(NULL,sb.st_size,PROT_READ,MAP_PRIVATE,fd,0);
if(start= = MAP_FAILED) /*判断是否映射成功*/
return;
printf(“%s”,start);
munma(start,sb.st_size); /*解除映射*/
closed(fd);
}
执行
root : x : 0 : root : /root : /bin/bash
bin : x : 1 : 1 : bin : /bin :
daemon : x : 2 : 2 :daemon : /sbin
adm : x : 3 : 4 : adm : /var/adm :
lp : x :4 :7 : lp : /var/spool/lpd :
sync : x : 5 : 0 : sync : /sbin : bin/sync :
shutdown : x : 6 : 0 : shutdown : /sbin : /sbin/shutdown
halt : x : 7 : 0 : halt : /sbin : /sbin/halt
mail : x : 8 : 12 : mail : /var/spool/mail :
news : x :9 :13 : news : /var/spool/news :
uucp : x :10 :14 : uucp : /var/spool/uucp :
operator : x : 11 : 0 :operator : /root:
games : x : 12 :100 : games :/usr/games:
gopher : x : 13 : 30 : gopher : /usr/lib/gopher-data:
ftp : x : 14 : 50 : FTP User : /home/ftp:
nobody : x :99: 99: Nobody : /:
xfs :x :100 :101 : X Font Server : /etc/xll/fs : /bin/false
gdm : x : 42 :42 : : /home/gdm: /bin/bash
kids : x : 500 :500 :/home/kids : /bin/bash