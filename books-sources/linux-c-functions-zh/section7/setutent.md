setutent（从头读取utmp 文件中的登录数据）
相关函数
getutent，endutent
表头文件
#include<utmp.h>
定义函数
void setutent(void);
函数说明
setutent()用来将getutent()的读写地址指回utmp文件开头。
附加说明
请参考setpwent()或setgrent()。