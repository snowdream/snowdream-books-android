exit（正常结束进程）
<pre>相关函数
_exit，atexit，on_exit
表头文件
#include< stdlib.h>
定义函数
void exit(int status);
函数说明
exit()用来正常终结目前进程的执行，并把参数status返回给父进程，而进程所有的缓冲区数据会自动写回并关闭未关闭的文件。
返回值

范例
参考wait（）</pre>