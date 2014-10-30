endutent（关闭utmp 文件）
相关函数
getutent，setutent
表头文件
#include<utmp.h>
定义函数
void endutent(void);
函数说明
endutent()用来关闭由getutent所打开的utmp文件。
返回值

附加说明

范例
请参考getutent()。