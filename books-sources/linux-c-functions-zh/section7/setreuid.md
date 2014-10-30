setreuid（设置真实及有效的用户识别码）
相关函数
setuid，seteuid，setfsuid
表头文件
#include<unistd.h>
定义函数
int setreuid(uid_t ruid,uid_t euid);
函数说明
setreuid()用来将参数ruid 设为目前进程的真实用户识别码，将参数euid 设置为目前进程的有效用户识别码。如果参数ruid 或euid值为-1，则对应的识别码不会改变。
返回值
执行成功则返回0，失败则返回-1，错误代码存于errno。
附加说明
请参考setuid（）。