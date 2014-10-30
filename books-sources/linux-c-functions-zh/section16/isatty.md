

isatty（判断文件描述词是否是为终端机）
<pre>相关函数
ttyname
表头文件
#include< unistd.h>
定义函数
int isatty(int desc);
函数说明
如果参数desc所代表的文件描述词为一终端机则返回1，否则返回0。
返回值
如果文件为终端机则返回1，否则返回0。
范例
参考ttyname()。</pre>