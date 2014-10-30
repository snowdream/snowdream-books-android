fsync（将缓冲区数据写回磁盘）
<pre>相关函数
sync
表头文件
#include< unistd.h>
定义函数
int fsync(int fd);
函数说明
fsync()负责将参数fd所指的文件数据，由系统缓冲区写回磁盘，以确保数据同步。
返回值
成功则返回0，失败返回-1，errno为错误代码。</pre>