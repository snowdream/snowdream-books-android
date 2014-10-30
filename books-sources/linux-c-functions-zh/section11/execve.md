execve（执行文件）
相关函数
fork，execl，execle，execlp，execv，execvp
表头文件
#include<unistd.h>
定义函数
int execve(const char * filename,char * const argv[ ],char * const envp[ ]);
函数说明
execve()用来执行参数filename字符串所代表的文件路径，第二个参数系利用数组指针来传递给执行文件，最后一个参数则为传递给执行文件的新环境变量数组。
返回值
如果执行成功则函数不会返回，执行失败则直接返回-1，失败原因存于errno 中。
错误代码
EACCES
1. 欲执行的文件不具有用户可执行的权限。
2. 欲执行的文件所属的文件系统是以noexec 方式挂上。
3.欲执行的文件或script翻译器非一般文件。
EPERM
1.进程处于被追踪模式，执行者并不具有root权限，欲执行的文件具有SUID 或SGID 位。
2.欲执行的文件所属的文件系统是以nosuid方式挂上，欲执行的文件具有SUID 或SGID 位元，但执行者并不具有root权限。
E2BIG 参数数组过大
ENOEXEC 无法判断欲执行文件的执行文件格式，有可能是格式错误或无法在此平台执行。
EFAULT 参数filename所指的字符串地址超出可存取空间范围。
ENAMETOOLONG 参数filename所指的字符串太长。
ENOENT 参数filename字符串所指定的文件不存在。
ENOMEM 核心内存不足
ENOTDIR 参数filename字符串所包含的目录路径并非有效目录
EACCES 参数filename字符串所包含的目录路径无法存取，权限不足
ELOOP 过多的符号连接
ETXTBUSY 欲执行的文件已被其他进程打开而且正把数据写入该文件中
EIO I/O 存取错误
ENFILE 已达到系统所允许的打开文件总数。
EMFILE 已达到系统所允许单一进程所能打开的文件总数。
EINVAL 欲执行文件的ELF执行格式不只一个PT_INTERP节区
EISDIR ELF翻译器为一目录
ELIBBAD ELF翻译器有问题。
范例
#include<unistd.h>
main()
{
char * argv[ ]={“ls”,”-al”,”/etc/passwd”,(char *)0};
char * envp[ ]={“PATH=/bin”,0}
execve(“/bin/ls”,argv,envp);
}
执行
-rw-r--r-- 1 root root 705 Sep 3 13 :52 /etc/passwd