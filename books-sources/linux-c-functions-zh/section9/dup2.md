dup2（复制文件描述词）
相关函数
open，close，fcntl，dup
表头文件
#include<unistd.h>
定义函数
int dup2(int odlfd,int newfd);
函数说明
dup2()用来复制参数oldfd所指的文件描述词，并将它拷贝至参数newfd后一块返回。若参数newfd为一已打开的文件描述词，则newfd所指的文件会先被关闭。dup2()所复制的文件描述词，与原来的文件描述词共享各种文件状态，详情可参考dup()。
返回值
当复制成功时，则返回最小及尚未使用的文件描述词。若有错误则返回-1，errno会存放错误代码。
附加说明
dup2()相当于调用fcntl(oldfd，F_DUPFD，newfd)；请参考fcntl()。
错误代码
EBADF 参数fd 非有效的文件描述词，或该文件已关闭