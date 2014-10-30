utmpname（设置utmp 文件路径）
<pre>相关函数
getutent，getutid，getutline，setutent，endutent，pututline
表头文件
#include< utmp.h>
定义函数
void utmpname(const char * file);
函数说明
utmpname()用来设置utmp文件的路径，以提供utmp相关函数的存取路径。如果没有使用utmpname()则默认utmp文件路径为/var/run/utmp。
返回值
</pre>