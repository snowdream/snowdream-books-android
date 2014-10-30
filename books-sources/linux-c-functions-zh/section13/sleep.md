

sleep（让进程暂停执行一段时间）
<pre>相关函数
signal，alarm
表头文件
#include< unistd.h>
定义函数
unsigned int sleep(unsigned int seconds);
函数说明
sleep()会令目前的进程暂停，直到达到参数seconds 所指定的时间，或是被信号所中断。
返回值
若进程暂停到参数seconds 所指定的时间则返回0，若有信号中断则返回剩余秒数。</pre>