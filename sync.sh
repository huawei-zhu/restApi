echo "begin to execute script"

{
	git remote add upstream "git@github.com:huawei-zhu/restApi.git"
} || {
	echo "remote upstream already exists"
}

echo "fetch"
git fetch upstream
git merge --ff-only upstream/master
echo "merging"
git add .

git commit -m "push to ODD!"
echo "push"
git push -f origin HEAD:master
echo "script execute finished"
