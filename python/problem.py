
anjin = "Cool"
anjin = "Amazing"
print anjin

hasi = "Amazing"

if hasi == anjin:
	print "hasi and anjin are friends"

number = 1
anotherNumber = 1.3
character = 'c'

grade = 5
grades = [10,98, 98, 97, 20, 25, 24, 100, 8, 95]

average = 0
sumGrades = 0

def findAve(array):
	sumArray =  0
	for i in range(0, len(array)):
		sumArray += array[i]
	return sumArray // len(array)

print "The average before curve is: " + str(findAve(grades))


def curve(grades):
	for i in range(0, len(grades)):
		if not grades[i] + 5 > 100:
			grades[i] += 5
		else:
			grades[i] = 100
curve(grades)

print "The average after curve is: " + str(findAve(grades))
