import random


class Greeting:

    def __init__(self, tname):
        self.tname = tname
        self.part1 = ['Hi ', 'Hello ', 'Hail ', 'Greetings ', 'Welcome back ']
        self.part2 = ['I am ', 'Sisyphus ', 'here ', 'present and ']
        self.part3 = ['at your services.', 'ready for orders.', 'reporting for duty.',
                      'waiting for action.', 'prepared to serve.']

    def greet(self):
        print(random.choice(self.part1) + self.tname + ', ' + random.choice(self.part2)
              + random.choice(self.part3) if self.tname != 'Dannylo' else random.choice(self.part1) + 'Master, ' + random.choice(self.part2)
              + random.choice(self.part3))

