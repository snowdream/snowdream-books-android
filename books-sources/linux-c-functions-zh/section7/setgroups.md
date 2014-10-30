setgroups（设置组代码）
相关函数
initgroups，getgroup，getgid，setgid
表头文件
#include<grp.h>
定义函数
int setgroups(size_t size,const gid_t * list);
函数说明
setgroups()用来将list 数组中所标明的组加入到目前进程的组设置中。参数size为list()的gid_t数目，最大值为NGROUP(32)。
返回值
设置成功则返回0，如有错误则返回-1。
错误代码
EFAULT 参数list数组地址不合法。
EPERM 权限不足，必须是root权限
EINVAL 参数size值大于NGROUP(32)。