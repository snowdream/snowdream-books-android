

chown（改变文件的所有者）
相关函数
fchown，lchown，chmod
表头文件
#include<sys/types.h>
#include<unistd.h>
定义函数
int chown(const char * path, uid_t owner,gid_t group);
函数说明
chown()会将参数path指定文件的所有者变更为参数owner代表的用户，而将该文件的组变更为参数group组。如果参数owner或group为-1，对应的所有者或组不会有所改变。root与文件所有者皆可改变文件组，但所有者必须是参数group组的成员。当root用chown()改变文件所有者或组时，该文件若具有S_ISUID或S_ISGID权限，则会清除此权限位，此外如果具有S_ISGID权限但不具S_IXGRP位，则该文件会被强制锁定，文件模式会保留。
返回值
成功则返回0，失败返回-1，错误原因存于errno。
错误代码
参考chmod（）。
范例
/* 将/etc/passwd 的所有者和组都设为root */
#include<sys/types.h>
#include<unistd.h>
main()
{
chown(“/etc/passwd”,0,0);
}