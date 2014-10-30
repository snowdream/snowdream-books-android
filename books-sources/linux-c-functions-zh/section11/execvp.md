execvp（执行文件）
<pre>相关函数
fork，execl，execle，execlp，execv，execve
表头文件
#include< unistd.h>
定义函数
int execvp(const char *file ,char * const argv []);
函数说明
execvp()会从PATH 环境变量所指的目录中查找符合参数file 的文件名，找到后便执行该文件，然后将第二个参数argv传给该欲执行的文件。
返回值
如果执行成功则函数不会返回，执行失败则直接返回-1，失败原因存于errno中。
错误代码
请参考execve（）。
范例
/*请与execlp（）范例对照*/
#include< unistd.h>
main()
{
char * argv[ ] ={ “ls”,”-al”,”/etc/passwd”,0};
execvp(“ls”,argv);
}
执行
-rw-r--r-- 1 root root 705 Sep 3 13 :52 /etc/passwd</pre>