_exit（结束进程执行）
<pre>相关函数
exit，wait，abort
表头文件
#include< unistd.h>
定义函数
void _exit(int status);
函数说明
_exit()用来立刻结束目前进程的执行，并把参数status返回给父进程，并关闭未关闭的文件。此函数调用后不会返回，并且会传递SIGCHLD信号给父进程，父进程可以由wait函数取得子进程结束状态。
返回值

附加说明
_exit（）不会处理标准I/O 缓冲区，如要更新缓冲区请使用exit（）。</pre>