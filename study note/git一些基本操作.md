# git一些基本操作

1.创建一个branch

查看当前已经存在的branch

git branch

git remote -v

创建一个新的branch在服务器上

git push upstream dev

 

将自己的origin和server的upstream关联后，才能通过 git fetch upstream 来将server上最新的code更新到自己的origin

git remote add upstream http://192.168.1.186/bigdata/mojing-server.git

2.git之http方式设置记住用户名和密码

git config --global credential.helper store

 

3.提交代码到<branch name>

从platform/upstream更新代码

git fetch upstream

git rebase -i upstream/<branch name>

将所有发生变化的文件添加到提交队列中

git add .

提交代码

git commit -m “提交说明”

git push origin <branch name>

 

4.从remote上取一个新的branch到本地

git checkout -b <branch name> upstream/<branch name>

 

 

git push origin <local branch name>:<branch name>

 

5.merge branch a into b

git checkout <branch b>

git fetch upstream

git rebase -i upstream/<branch b>

git merge --no-ff upstream/<branch a>

git push origin <branch b>

 

git update-index --assume-unchanged <具体文件全路径>

git update-index --no-assume-unchanged <具体文件全路径>

 

git stash pop

 

6.强制退回到某次提交

切换branch

git checkout <branch>

查看提交日志

git log

退回到某次提交

git reset --hard <提交的编号>

 

7.删除服务器上的版本

git push origin --delete <branch name>

或者 git push origin :dbg_lichen_star // 相当于推一个空分支到远程分支dbg_lichen_star

 

8.删除服务器分支后，本地更新

git fetch -p

 

9.**git创建分支并推送到远程分支**

**git checkout -b dbg_lichen_star //** 新建一个本地分支并切换到它

**git push origin** **dbg_lichen_star:dbg_lichen_star** // 把新建的本地分支push到远程服务器，远程分支与本地分支同名（当然可以随意起名）

 

 

git checkout -b <new branch name> <from where>

 

git remote add http://192.168.1.186/platform/mojing-csp.git

git fetch upstream

git checkout -b upstream-dev upstream/dev

git push origin upstream-dev:dev

 

git checkout -b dev origin/dev