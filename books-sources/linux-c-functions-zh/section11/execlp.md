execlp（从PATH 环境变量中查找文件并执行）
相关函数
fork，execl，execle，execv，execve，execvp
表头文件
#include<unistd.h>
定义函数
int execlp(const char * file,const char * arg,……)；
函数说明
execlp()会从PATH 环境变量所指的目录中查找符合参数file的文件名，找到后便执行该文件，然后将第二个以后的参数当做该文件的argv[0]、argv[1]……，最后一个参数必须用空指针(NULL)作结束。
返回值
如果执行成功则函数不会返回，执行失败则直接返回-1，失败原因存于errno 中。
错误代码
参考execve()。
范例
/* 执行ls -al /etc/passwd execlp()会依PATH 变量中的/bin找到/bin/ls */
#include<unistd.h>
main()
{
execlp(“ls”,”ls”,”-al”,”/etc/passwd”,(char *)0);
}
执行
-rw-r--r-- 1 root root 705 Sep 3 13 :52 /etc/passwd