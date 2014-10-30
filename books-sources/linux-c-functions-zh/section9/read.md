

read（由已打开的文件读取数据）
<pre>相关函数
readdir，write，fcntl，close，lseek，readlink，fread
表头文件
#include< unistd.h>
定义函数
ssize_t read(int fd,void * buf ,size_t count);
函数说明
read()会把参数fd 所指的文件传送count个字节到buf指针所指的内存中。若参数count为0，则read()不会有作用并返回0。返回值为实际读取到的字节数，如果返回0，表示已到达文件尾或是无可读取的数据，此外文件读写位置会随读取到的字节移动。
附加说明
如果顺利read()会返回实际读到的字节数，最好能将返回值与参数count 作比较，若返回的字节数比要求读取的字节数少，则有可能读到了文件尾、从管道(pipe)或终端机读取，或者是read()被信号中断了读取动作。当有错误发生时则返回-1，错误代码存入errno中，而文件读写位置则无法预期。
错误代码
EINTR 此调用被信号所中断。
EAGAIN 当使用不可阻断I/O 时（O_NONBLOCK），若无数据可读取则返回此值。
EBADF 参数fd 非有效的文件描述词，或该文件已关闭。
范例
参考open（）。</pre>