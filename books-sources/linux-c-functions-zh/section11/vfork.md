vfork（建立一个新的进程）
相关函数
wait，execve
表头文件
#include<unistd.h>
定义函数
pid_t vfork(void);
函数说明
vfork()会产生一个新的子进程，其子进程会复制父进程的数据与堆栈空间，并继承父进程的用户代码，组代码，环境变量、已打开的文件代码、工作目录和资源限制等。Linux 使用copy-on-write(COW)技术，只有当其中一进程试图修改欲复制的空间时才会做真正的复制动作，由于这些继承的信息是复制而来，并非指相同的内存空间，因此子进程对这些变量的修改和父进程并不会同步。此外，子进程不会继承父进程的文件锁定和未处理的信号。注意，Linux不保证子进程会比父进程先执行或晚执行，因此编写程序时要留意
死锁或竞争条件的发生。

返回值
如果vfork()成功则在父进程会返回新建立的子进程代码(PID)，而在新建立的子进程中则返回0。如果vfork 失败则直接返回-1，失败原因存于errno中。
错误代码
EAGAIN 内存不足。ENOMEM 内存不足，无法配置核心所需的数据结构空间。
范例
#include<unistd.h>
main()
{
if(vfork() = =0)
{
printf(“This is the child process\n”);
}else{
printf(“This is the parent process\n”);
}
}
执行
this is the parent process
this is the child process