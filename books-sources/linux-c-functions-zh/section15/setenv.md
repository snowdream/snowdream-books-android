setenv（改变或增加环境变量）
<pre>相关函数
getenv，putenv，unsetenv
表头文件
#include< stdlib.h>
定义函数
int setenv(const char *name,const char * value,int overwrite);
函数说明
setenv()用来改变或增加环境变量的内容。参数name为环境变量名称字符串。
参数
value则为变量内容，参数overwrite用来决定是否要改变已存在的环境变量。如果overwrite不为0，而该环境变量原已有内容，则原内容会被改为参数value所指的变量内容。如果overwrite为0，且该环境变量已有内容，则参数value会被忽略。
返回值
执行成功则返回0，有错误发生时返回-1。
错误代码
ENOMEM 内存不足，无法配置新的环境变量空间
范例
#include< stdlib.h>
main()
{
char * p;
if((p=getenv(“USER”)))
printf(“USER =%s\n”,p);
setenv(“USER”,”test”,1);
printf(“USER=%s\n”,getenv(“USEr”));
unsetenv(“USER”);
printf(“USER=%s\n”,getenv(“USER”));
}
执行
USER = root
USER = test
USER = (null)</pre>