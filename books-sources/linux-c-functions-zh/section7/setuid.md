setuid（设置真实的用户识别码）
<pre>相关函数
getuid，setreuid，seteuid，setfsuid
表头文件
#include< unistd.h>
定义函数
int setuid(uid_t uid)
函数说明
setuid()用来重新设置执行目前进程的用户识别码。不过，要让此函数有作用，其有效的用户识别码必须为0(root)。在Linux下，当root使用setuid()来变换成其他用户识别码时，root权限会被抛弃，完全转换成该用户身份，也就是说，该进程往后将不再具有可setuid()的权利，如果只是向暂时抛弃root 权限，稍后想重新取回权限，则必须使用seteuid()。
返回值
执行成功则返回0，失败则返回-1，错误代码存于errno。
附加说明
一般在编写具setuid root的程序时，为减少此类程序带来的系统安全风险，在使用完root权限后建议马上执行setuid(getuid());来抛弃root权限。此外，进程uid和euid不一致时Linux系统将不会产生core dump。</pre>