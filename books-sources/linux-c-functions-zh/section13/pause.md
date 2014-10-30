pause（让进程暂停直到信号出现）
<pre>相关函数
kill，signal，sleep
表头文件
#include< unistd.h>
定义函数
int pause(void);
函数说明
pause()会令目前的进程暂停（进入睡眠状态），直到被信号(signal)所中断。
返回值
只返回-1。
错误代码
EINTR 有信号到达中断了此函数。</pre>