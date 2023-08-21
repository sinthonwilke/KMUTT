x, y = [float(i) for i in input().split()]

if x == 0 and y == 0: print("Origin")
elif x == 0 and y > 0: print("Positive Y-axis")
elif x == 0 and y < 0: print("Negative Y-axis")
elif x > 0 and y == 0: print("Positive X-axis")
elif x < 0 and y == 0: print("Negative X-axis")
elif x > 0 and y > 0: print("1st Quadrant")
elif x < 0 and y > 0: print("2nd Quadrant")
elif x < 0 and y < 0: print("3rd Quadrant")
elif x > 0 and y < 0: print("4th Quadrant")
    