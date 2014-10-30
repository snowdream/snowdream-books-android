endgrent（关闭组文件）
相关函数
getgrent，setgrent
表头文件
#include<grp.h>
#include<sys/types.h>
定义函数
void endgrent(void);
函数说明
endgrent()用来关闭由getgrent()所打开的密码文件。
返回值

附加说明

范例
请参考getgrent()与setgrent()。