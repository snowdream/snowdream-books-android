fstat（由文件描述词取得文件状态）
相关函数
stat，lstat，chmod，chown，readlink，utime
表头文件
#include<sys/stat.h>
#include<unistd.h>
定义函数
int fstat(int fildes,struct stat *buf);
函数说明
fstat()用来将参数fildes所指的文件状态，复制到参数buf所指的结构中(struct stat)。Fstat()与stat()作用完全相同，不同处在于传入的参数为已打开的文件描述词。详细内容请参考stat()。
返回值
执行成功则返回0，失败返回-1，错误代码存于errno。
范例
#include<sys/stat.h>
#include<unistd.h>
#include<fcntk.h>
main()
{
struct stat buf;
int fd;
fd = open (“/etc/passwd”,O_RDONLY);
fstat(fd,&buf);
printf(“/etc/passwd file size +%d\n “,buf.st_size);
}
执行
/etc/passwd file size = 705