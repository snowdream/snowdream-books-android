execv（执行文件）
相关函数
fork，execl，execle，execlp，execve，execvp
表头文件
#include<unistd.h>
定义函数
int execv (const char * path, char * const argv[ ]);
函数说明
execv()用来执行参数path字符串所代表的文件路径，与execl()不同的地方在于execve()只需两个参数，第二个参数利用数组指针来传递给执行文件。
返回值
如果执行成功则函数不会返回，执行失败则直接返回-1，失败原因存于errno 中。
错误代码
请参考execve（）。
范例
/* 执行/bin/ls -al /etc/passwd */
#include<unistd.h>
main()
{
char * argv[ ]={“ls”,”-al”,”/etc/passwd”,(char*) }};
execv(“/bin/ls”,argv);
}
执行
-rw-r--r-- 1 root root 705 Sep 3 13 :52 /etc/passwd