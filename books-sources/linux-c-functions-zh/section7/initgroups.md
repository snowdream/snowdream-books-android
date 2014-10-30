initgroups（初始化组清单）
<pre>相关函数
setgrent，endgrent
表头文件
#include< grp.h>
#include< sys/types.h>
定义函数
int initgroups(const char *user,gid_t group);
函数说明
initgroups（）用来从组文件（/etc/group）中读取一项组数据，若该组数据的成员中有参数user时，便将参数group组识别码加入到此数据中。
返回值
执行成功则返回0，失败则返回-1，错误码存于errno。</pre>