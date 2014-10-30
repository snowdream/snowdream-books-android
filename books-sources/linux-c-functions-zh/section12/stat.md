

stat（取得文件状态）
相关函数
fstat，lstat，chmod，chown，readlink，utime
表头文件
#include<sys/stat.h>
#include<unistd.h>
定义函数
int stat(const char * file_name,struct stat *buf);
函数说明
stat()用来将参数file_name所指的文件状态，复制到参数buf所指的结构中。
下面是struct stat内各参数的说明
struct stat
{
dev_t st_dev; /*device*/
ino_t st_ino; /*inode*/
mode_t st_mode; /*protection*/
nlink_t st_nlink; /*number of hard links */
uid_t st_uid; /*user ID of owner*/
gid_t st_gid; /*group ID of owner*/
dev_t st_rdev; /*device type */
off_t st_size; /*total size, in bytes*/
unsigned long st_blksize; /*blocksize for filesystem I/O */
unsigned long st_blocks; /*number of blocks allocated*/
time_t st_atime; /* time of lastaccess*/
time_t st_mtime; /* time of last modification */
time_t st_ctime; /* time of last change */
};
st_dev 文件的设备编号
st_ino 文件的i-node
st_mode 文件的类型和存取的权限
st_nlink 连到该文件的硬连接数目，刚建立的文件值为1。
st_uid 文件所有者的用户识别码
st_gid 文件所有者的组识别码
st_rdev 若此文件为装置设备文件，则为其设备编号
st_size 文件大小，以字节计算
st_blksize 文件系统的I/O 缓冲区大小。
st_blcoks 占用文件区块的个数，每一区块大小为512 个字节。
st_atime 文件最近一次被存取或被执行的时间，一般只有在用mknod、utime、read、write与tructate时改变。
st_mtime 文件最后一次被修改的时间，一般只有在用mknod、utime和write时才会改变
st_ctime i-node最近一次被更改的时间，此参数会在文件所有者、组、权限被更改时更新先前所描述的st_mode 则定义了下列数种情况
S_IFMT 0170000 文件类型的位遮罩
S_IFSOCK 0140000 scoket
S_IFLNK 0120000 符号连接
S_IFREG 0100000 一般文件
S_IFBLK 0060000 区块装置
S_IFDIR 0040000 目录
S_IFCHR 0020000 字符装置
S_IFIFO 0010000 先进先出
S_ISUID 04000 文件的（set user-id on execution）位
S_ISGID 02000 文件的（set group-id on execution）位
S_ISVTX 01000 文件的sticky位
S_IRUSR（S_IREAD） 00400 文件所有者具可读取权限
S_IWUSR（S_IWRITE）00200 文件所有者具可写入权限
S_IXUSR（S_IEXEC） 00100 文件所有者具可执行权限
S_IRGRP 00040 用户组具可读取权限
S_IWGRP 00020 用户组具可写入权限
S_IXGRP 00010 用户组具可执行权限
S_IROTH 00004 其他用户具可读取权限
S_IWOTH 00002 其他用户具可写入权限
S_IXOTH 00001 其他用户具可执行权限
上述的文件类型在POSIX 中定义了检查这些类型的宏定义
S_ISLNK （st_mode） 判断是否为符号连接
S_ISREG （st_mode） 是否为一般文件
S_ISDIR （st_mode）是否为目录
S_ISCHR （st_mode）是否为字符装置文件
S_ISBLK （s3e） 是否为先进先出
S_ISSOCK （st_mode） 是否为socket
若一目录具有sticky 位（S_ISVTX），则表示在此目录下的文件只能被该文件所有者、此目录所有者或root来删除或改名。
返回值
执行成功则返回0，失败返回-1，错误代码存于errno
错误代码
ENOENT 参数file_name指定的文件不存在
ENOTDIR 路径中的目录存在但却非真正的目录
ELOOP 欲打开的文件有过多符号连接问题，上限为16符号连接
EFAULT 参数buf为无效指针，指向无法存在的内存空间
EACCESS 存取文件时被拒绝
ENOMEM 核心内存不足
ENAMETOOLONG 参数file_name的路径名称太长
范例
#include<sys/stat.h>
#include<unistd.h>
mian()
{
struct stat buf;
stat (“/etc/passwd”,&buf);
printf(“/etc/passwd file size = %d \n”,buf.st_size);
}
执行
/etc/passwd file size = 705