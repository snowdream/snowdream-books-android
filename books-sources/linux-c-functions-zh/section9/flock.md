flock（锁定文件或解除锁定）
<pre>相关函数
open,fcntl
表头文件
#include< sys/file.h>
定义函数
int flock(int fd,int operation);
函数说明
flock()会依参数operation所指定的方式对参数fd所指的文件做各种锁定或解除锁定的动作。此函数只能锁定整个文件，无法锁定文件的某一区域。
参数
operation有下列四种情况:
LOCK_SH 建立共享锁定。多个进程可同时对同一个文件作共享锁定。
LOCK_EX 建立互斥锁定。一个文件同时只有一个互斥锁定。
LOCK_UN 解除文件锁定状态。
LOCK_NB 无法建立锁定时，此操作可不被阻断，马上返回进程。通常与LOCK_SH或LOCK_EX 做OR(|)组合。
单一文件无法同时建立共享锁定和互斥锁定，而当使用dup()或fork()时文件描述词不会继承此种锁定。
返回值
返回0表示成功，若有错误则返回-1，错误代码存于errno。</pre>