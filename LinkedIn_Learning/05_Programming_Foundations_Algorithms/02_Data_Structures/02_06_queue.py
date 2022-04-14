from collections import deque

# TODO: create an empty deque
queue = deque()

# TODO: fill the queue
queue.append(2)
queue.append(5)
queue.append(4)
queue.append(9)

# TODO: create an empty deque
print(queue)

# TODO: dequeue an item
x = queue.popleft()
print(x)
print(queue)