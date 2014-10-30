

popen（建立管道I/O）
<pre>相关函数
pipe，mkfifo，pclose，fork，system，fopen
表头文件
#include< stdio.h>
定义函数
FILE * popen( const char * command,const char * type);
函数说明
popen()会调用fork()产生子进程，然后从子进程中调用/bin/sh -c来执行参数command的指令。参数type可使用“r”代表读取，“w”代表写入。依照此type值，popen()会建立管道连到子进程的标准输出设备或标准输入设备，然后返回一个文件指针。随后进程便可利用此文件指针来读取子进程的输出设备或是写入到子进程的标准输入设备中。此外，所有使用文件指针(FILE*)操作的函数也都可以使用，除了fclose()以外。
返回值
若成功则返回文件指针，否则返回NULL，错误原因存于errno中。
错误代码
EINVAL参数type不合法。
注意事项
在编写具SUID/SGID权限的程序时请尽量避免使用popen()，popen()会继承环境变量，通过环境变量可能会造成系统安全的问题。
范例
#include< stdio.h>
main()
{
FILE * fp;
char buffer[80];
fp=popen(“cat /etc/passwd”,”r”);
fgets(buffer,sizeof(buffer),fp);
printf(“%s”,buffer);
pclose(fp);
}
执行
root :x:0 0: root: /root: /bin/bash</pre>