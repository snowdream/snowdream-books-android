mkfifo（建立具名管道）
<pre>相关函数
pipe，popen，open，umask
表头文件
#include< sys/types.h>
#include< sys/stat.h>
定义函数
int mkfifo(const char * pathname,mode_t mode);
函数说明
mkfifo()会依参数pathname建立特殊的FIFO文件，该文件必须不存在，而参数mode为该文件的权限（mode%~umask），因此umask值也会影响到FIFO文件的权限。Mkfifo()建立的FIFO文件其他进程都可以用读写一般文件的方式存取。当使用open()来打开FIFO文件时，O_NONBLOCK旗标会有影响
1、当使用O_NONBLOCK 旗标时，打开FIFO 文件来读取的操作会立刻返回，但是若还没有其他进程打开FIFO 文件来读取，则写入的操作会返回ENXIO 错误代码。
2、没有使用O_NONBLOCK 旗标时，打开FIFO 来读取的操作会等到其他进程打开FIFO文件来写入才正常返回。同样地，打开FIFO文件来写入的操作会等到其他进程打开FIFO 文件来读取后才正常返回。
返回值
若成功则返回0，否则返回-1，错误原因存于errno中。
错误代码
EACCESS 参数pathname所指定的目录路径无可执行的权限
EEXIST 参数pathname所指定的文件已存在。
ENAMETOOLONG 参数pathname的路径名称太长。
ENOENT 参数pathname包含的目录不存在
ENOSPC 文件系统的剩余空间不足
ENOTDIR 参数pathname路径中的目录存在但却非真正的目录。
EROFS 参数pathname指定的文件存在于只读文件系统内。
范例
#include< sys/types.h>
#include< sys/stat.h>
#include< fcntl.h>
main()
{
char buffer[80];
int fd;
unlink(FIFO);
mkfifo(FIFO,0666);
if(fork()>0){
char s[ ] = “hello!\n”;
fd = open (FIFO,O_WRONLY);
write(fd,s,sizeof(s));
close(fd);
}
else{
fd= open(FIFO,O_RDONLY);
read(fd,buffer,80);
printf(“%s”,buffer);
close(fd);
}
}
执行
hello!</pre>