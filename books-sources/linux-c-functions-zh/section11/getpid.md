getpid（取得进程识别码）
<pre>相关函数
fork，kill，getpid
表头文件
#include< unistd.h>
定义函数
pid_t getpid(void);
函数说明
getpid（）用来取得目前进程的进程识别码，许多程序利用取到的此值来建立临时文件，以避免临时文件相同带来的问题。
返回值
目前进程的进程识别码
范例
#include< unistd.h>
main()
{
printf(“pid=%d\n”,getpid());
}
执行
pid=1494 /*每次执行结果都不一定相同*/</pre>