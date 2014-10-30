
creat（建立文件）
<pre>相关函数
read，write，fcntl，close，link，stat，umask，unlink，fopen
表头文件
#include< sys/types.h>
#include< sys/stat.h>
#include< fcntl.h>
定义函数
int creat(const char * pathname, mode_tmode);
函数说明
参数pathname指向欲建立的文件路径字符串。Creat()相当于使用下列的调用方式调用open()
open(const char * pathname ,(O_CREAT|O_WRONLY|O_TRUNC));
错误代码
关于参数mode请参考open（）函数。
返回值
creat()会返回新的文件描述词，若有错误发生则会返回-1，并把错误代码设给errno。
EEXIST 参数pathname所指的文件已存在。
EACCESS 参数pathname 所指定的文件不符合所要求测试的权限
EROFS 欲打开写入权限的文件存在于只读文件系统内
EFAULT 参数pathname 指针超出可存取的内存空间
EINVAL 参数mode 不正确。
ENAMETOOLONG 参数pathname太长。
ENOTDIR 参数pathname为一目录
ENOMEM 核心内存不足
ELOOP 参数pathname有过多符号连接问题。
EMFILE 已达到进程可同时打开的文件数上限
ENFILE 已达到系统可同时打开的文件数上限
附加说明
creat()无法建立特别的装置文件，如果需要请使用mknod()。
范例
请参考open()。</pre>