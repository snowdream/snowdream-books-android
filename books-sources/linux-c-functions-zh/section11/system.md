system（执行shell 命令）
相关函数
fork，execve，waitpid，popen
表头文件
#include<stdlib.h>
定义函数
int system(const char * string);
函数说明
system()会调用fork()产生子进程，由子进程来调用/bin/sh-c string来执行参数string字符串所代表的命令，此命令执行完后随即返回原调用的进程。在调用system()期间SIGCHLD 信号会被暂时搁置，SIGINT和SIGQUIT 信号则会被忽略。
返回值
如果system()在调用/bin/sh时失败则返回127，其他失败原因返回-1。若参数string为空指针(NULL)，则返回非零值。如果system()调用成功则最后会返回执行shell命令后的返回值，但是此返回值也有可能为system()调用/bin/sh失败所返回的127，因此最好能再检查errno 来确认执行成功。
附加说明
在编写具有SUID/SGID权限的程序时请勿使用system()，system()会继承环境变量，通过环境变量可能会造成系统安全的问题。
范例
#include<stdlib.h>
main()
{
system(“ls -al /etc/passwd /etc/shadow”);
}
执行
-rw-r--r-- 1 root root 705 Sep 3 13 :52 /etc/passwd
-r--------- 1 root root 572 Sep 2 15 :34 /etc/shadow