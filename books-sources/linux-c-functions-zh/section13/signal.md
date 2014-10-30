


signal（设置信号处理方式）
<pre>相关函数
sigaction，kill，raise
表头文件
#include< signal.h>
定义函数
void (*signal(int signum,void(* handler)(int)))(int);
函数说明
signal()会依参数signum 指定的信号编号来设置该信号的处理函数。当指定的信号到达时就会跳转到参数handler指定的函数执行。如果参数handler不是函数指针，则必须是下列两个常数之一:
SIG_IGN 忽略参数signum指定的信号。
SIG_DFL 将参数signum 指定的信号重设为核心预设的信号处理方式。
关于信号的编号和说明，请参考附录D
返回值
返回先前的信号处理函数指针，如果有错误则返回SIG_ERR(-1)。
附加说明
在信号发生跳转到自定的handler处理函数执行后，系统会自动将此处理函数换回原来系统预设的处理方式，如果要改变此操作请改用sigaction()。
范例
参考alarm()或raise()。</pre>