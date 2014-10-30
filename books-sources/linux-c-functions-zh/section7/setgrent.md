setgrent（从头读取组文件中的组数据）
<pre>相关函数
getgrent，endgrent
表头文件
#include< grp.h>
#include< sys/types.h>
定义函数
void setgrent(void);
函数说明
setgrent()用来将getgrent()的读写地址指回组文件开头。
返回值

附加说明
请参考setpwent()。</pre>