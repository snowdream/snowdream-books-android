getppid（取得父进程的进程识别码）
相关函数
fork，kill，getpid
表头文件
#include<unistd.h>
定义函数
pid_t getppid(void);
函数说明
getppid()用来取得目前进程的父进程识别码。
返回值
目前进程的父进程识别码。
范例
#include<unistd.h>
main()
{
printf(“My parent ‘pid =%d\n”,getppid());
}
执行
My parent pid =463