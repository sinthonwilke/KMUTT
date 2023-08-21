class Engine:
    def start(self):
        pass
    def stop(self):
        pass
class ElectricEngine(Engine):  # Is-A Engine
    pass
class V8Engine(Engine):  # Is-A Engine
    pass


class Car:
    engine_cls = Engine
    def __init__(self):
        self.engine = self.engine_cls()  # Has-A Engine
    def start(self):
        print(
            'Starting engine {0} for car {1}... Wroom, wroom!'
            .format(
                self.engine.__class__.__name__,
                self.__class__.__name__)
        )
        self.engine.start()
    def stop(self):
        self.engine.stop()


a = Car()
print(a.engine)