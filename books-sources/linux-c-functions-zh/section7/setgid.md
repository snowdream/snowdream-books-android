
setgid（设置真实的组识别码）
<pre>相关函数
getgid，setregid，getegid，setegid
表头文件
#include< unistd.h>
定义函数
int setgid(gid_t gid);
函数说明
setgid()用来将目前进程的真实组识别码(real gid)设成参数gid值。如果是以超级用户身份执行此调用，则real、effective与savedgid都会设成参数gid。
返回值
设置成功则返回0，失败则返回-1，错误代码存于errno中。
错误代码
EPERM 并非以超级用户身份调用，而且参数gid 并非进程的effective gid或saved gid值之一</pre>