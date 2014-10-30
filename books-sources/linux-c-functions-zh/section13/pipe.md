
pipe（建立管道）
<pre>相关函数
mkfifo，popen，read，write，fork
表头文件
#include< unistd.h>
定义函数
int pipe(int filedes[2]);
函数说明
pipe()会建立管道，并将文件描述词由参数filedes数组返回。filedes[0]为管道里的读取端，filedes[1]则为管道的写入端。
返回值
若成功则返回零，否则返回-1，错误原因存于errno中。
错误代码
EMFILE 进程已用完文件描述词最大量。
ENFILE 系统已无文件描述词可用。
EFAULT 参数filedes数组地址不合法。
范例
/* 父进程借管道将字符串“hello!\n”传给子进程并显示*/
#include < unistd.h>
main()
{
int filedes[2];
char buffer[80];
pipe(filedes);
if(fork()>0){
/* 父进程*/
char s[ ] = “hello!\n”;
write(filedes[1],s,sizeof(s));
}
else{
/*子进程*/
read(filedes[0],buffer,80);
printf(“%s”,buffer);
}
}
执行
hello!</pre>