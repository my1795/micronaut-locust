import random

from locust import HttpUser, task

class HelloWorldUser(HttpUser):
    @task
    def hello_world(self):
        # Generate random values for num1 and num2
        num1 = random.randint(1, 100)  # Modify the range as needed
        num2 = random.randint(1, 100)  # Modify the range as needed

        # Send the GET request with the random num1 and num2 values
        self.client.get(f"/multiply?num1={num1}&num2={num2}")