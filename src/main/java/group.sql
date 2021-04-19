id course score

select t1.*
from person t1
where  (select count(*) + 1 from person t2 where t1.course = t2.course and t2.socre > t1.score ) <= 2
order by course


select t1.*
from person t1
where  exists ( select count(*) + 1 from person t2 where t1.course = t2.course and t2.socre > t1.score having count(*) +1 <= 2)
order by course