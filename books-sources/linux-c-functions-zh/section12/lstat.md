lstat（由文件描述词取得文件状态）
相关函数
stat，fstat，chmod，chown，readlink，utime
表头文件
#include<sys/stat.h>
#include<unistd.h>
定义函数
int lstat (const char * file_name.struct stat * buf);
函数说明
lstat()与stat()作用完全相同，都是取得参数file_name所指的文件状态，其差别在于，当文件为符号连接时，lstat()会返回该link本身的状态。详细内容请参考stat()。
返回值
执行成功则返回0，失败返回-1，错误代码存于errno。
范例
参考stat()。