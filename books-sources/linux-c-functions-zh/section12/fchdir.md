fchdir（改变当前的工作目录）
相关函数
getcwd，chroot
表头文件
#include<unistd.h>
定义函数
int fchdir(int fd);
函数说明
fchdir()用来将当前的工作目录改变成以参数fd 所指的文件描述词。
返回值执
行成功则返回0，失败返回-1，errno为错误代码。
附加说明

范例
#include<sys/types.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
main()
{
int fd;
fd = open(“/tmp”,O_RDONLY);
fchdir(fd);
printf(“current working directory : %s \n”,getcwd(NULL,NULL));
close(fd);
}
执行
current working directory : /tmp