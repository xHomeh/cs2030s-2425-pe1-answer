PE1.1.in:
- 1 queueSize, 5 capacity
- 1 admin, 4 visitors
- Silently dropping of visitors if queues are full

PE1.2.in:
- 2 queueSize, 5 capacity
- 2 admins, 4 visitors
- Handles multiple admins
- One of the admin leaves if there are no jobs to be processed

PE1.3.in:
- 2 queueSize, 2 capacity
- 1 admin, 4 visitors
- Capacity exceeded

PE1.4.in:
- 2 queueSize, 7 capacity
- 1 admin, 6 visitors
- Single admin handling multiple visitors

PE1.6.in
- 2 queueSize, 5 capacity
- 2 admin, 0 visitors
- Vanilla case without visitors

PE1.7.in
- 2 queueSize, 5 capacity
- 0 admin, 4 output visitors
- Vanilla case without admins

PE1.6.in - Able to handle AdminArrivalEvent
PE1.7.in - Able to handle VisitorArrivalEvent
PE1.1.in - Able to handle silently dropping of visitors if queues are full
PE1.2.in - Able to handle multiple admins
PE1.3.in - Able to handle CongestionEvent
PE1.4.in - Able to handle overall operation
PE1.5.in - Able to handle silent departure of admins if nothing to process
