ttyname（返回一终端机名称）
<pre>相关函数
Isatty
表头文件
#include< unistd.h>
定义函数
char * ttyname(int desc);
函数说明
如果参数desc所代表的文件描述词为一终端机，则会将此终端机名称由一字符串指针返回，否则返回NULL。
返回值
如果成功则返回指向终端机名称的字符串指针，有错误情况发生时则返回NULL。
范例
#include< unistd.h>
#include< sys/types.h>
#include < sys/stat.h>
#include< fcntl.h>
main()
{
int fd;
char * file = “/dev/tty”;
fd = open (fiel,O_RDONLY);
printf(“%s”,file);
if(isatty(fd)){
printf(“is a tty.\n”);
printf(“ttyname = %s \n”,ttyname(fd));
}
else printf(“ is not a tty\n”);
close(fd);
}
执行
/dev/tty is a tty
ttyname = /dev/tty</pre>