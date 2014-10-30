bcopy（拷贝内存内容）
<pre>相关函数
memccpy，memcpy，memmove，strcpy，ctrncpy
表头文件
#include < string.h>
定义函数
void bcopy ( const void *src,void *dest ,int n);
函数说明
bcopy()与memcpy()一样都是用来拷贝src所指的内存内容前n个字节到dest所指的地址，不过参数src与dest在传给函数时是相反的位置。
返回值

附加说明
建议使用memcpy()取代
范例
#include< string.h>
main()
{
char dest[30]=”string(a)”;
char src[30]=”string\0string”;
int i;
bcopy(src,dest,30);/* src指针放在前*/
printf(bcopy(): “)
for(i=0;i<30;i++)
printf(“%c”,dest[i]);
memcpy(dest src,30); /*dest指针放在钱*/
printf(‘\nmemcpy() : “);
for(i=0;i<30;i++)
printf(“%c”,dest[i]);
执行
bcopy() : string string
memcpy() :string sring</pre>