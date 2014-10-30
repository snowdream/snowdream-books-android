alarm（设置信号传送闹钟）
相关函数
signal，sleep
表头文件
#include<unistd.h>
定义函数
unsigned int alarm(unsigned int seconds);
函数说明
alarm()用来设置信号SIGALRM在经过参数seconds指定的秒数后传送给目前的进程。如果参数seconds 为0，则之前设置的闹钟会被取消，并将剩下的时间返回。
返回值
返回之前闹钟的剩余秒数，如果之前未设闹钟则返回0。
范例
#include<unistd.h>
#include<signal.h>
void handler() {
printf(“hello\n”);
}
main()
{
int i;
signal(SIGALRM,handler);
alarm(5);
for(i=1;i<7;i++){
printf(“sleep %d ...\n”,i);
sleep(1);
}
}
执行
sleep 1 ...
sleep 2 ...
sleep 3 ...
sleep 4 ...
sleep 5 ...
hello
sleep 6 ...