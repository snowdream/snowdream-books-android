setregid（设置真实及有效的组识别码）
相关函数
setgid，setegid，setfsgid
表头文件
#include<unistd.h>
定义函数
int setregid(gid_t rgid,gid_t egid);
函数说明
setregid()用来将参数rgid设为目前进程的真实组识别码，将参数egid设置为目前进程的有效组识别码。如果参数rgid或egid值为-1，则对应的识别码不会改变。
返回值
执行成功则返回0，失败则返回-1，错误代码存于errno。