class BerkeleyAlgorithm:
    def __init__(self):
        self.nodes = {}

    def add_node(self, name, time):
        self.nodes[name] = time

    def synchronize_clocks(self, synchronized_time):
        time_daemon = self.nodes["Time Daemon"]
        for node, time in self.nodes.items():
            correction_value = time_daemon - time
            corrected_time = int((synchronized_time) // 60), int((synchronized_time) % 60)
            print(f"{node}: {corrected_time[0]:02d}:{corrected_time[1]:02d} [Correction Value: {correction_value}]")
def time_to_minutes(time_str):
    try:
        hours, minutes = map(int, time_str.split(":"))
        return hours * 60 + minutes
    except ValueError:
        print("Invalid time format. Please use 'hh:mm'.")
        return None

if __name__ == "__main__":
    berkeley = BerkeleyAlgorithm()

    # Sample input
    time=(input("Enter Time Daemon time 'hh:mm' format: "));
    berkeley.add_node("Time Daemon",time_to_minutes(time))
    n=int(input("Enter number of nodes"))
    for i in range(n):
        time = input("Enter time  of Node %d in 'hh:mm' format: "%(i+1))
        berkeley.add_node("Node %d"%(i+1),time_to_minutes(time));
    # Synchronize clocks to a specific time (15:05)
    synchronized_time = time_to_minutes(input("Enter Synchronization time in 'hh:mm' format: "))
    print("After Synchronization...")
    berkeley.synchronize_clocks(synchronized_time)

