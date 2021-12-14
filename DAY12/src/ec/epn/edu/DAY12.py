theGraph = {
    'start': {'op':1, 'zh':1, 'PF':1},
    'op': {'start':1, 'bj':1, 'PF':1, 'zh':1},
    'PF': {'da':1, 'bj':1, 'op':1, 'zh':1, 'start':1},
    'zh': {'iw':1, 'start':1, 'bj':1, 'op':1, 'PF':1},
    'bj': {'op':1, 'PF':1, 'iw':1, 'zh':1, 'HR':1, 'QR':1},
    'iw': {'zh':1, 'QR':1, 'bj':1, 'HR':1},
    'LY': {'da':1},
    'da': {'QR':1, 'PF':1, 'LY':1, 'end':1, 'HR':1},
    'HR': {'end':1, 'iw':1, 'bj':1, 'da':1},
    'QR': {'da':1, 'end':1, 'al':1, 'iw':1, 'bj':1},
    'al': {'QR':1},
    'end': {'QR':1, 'HR':1, 'da':1}
}

def print_path(paths):
    for path in paths:
        print(' -> '.join(point for point in path))
    
def dfs(source, destination, path=None):
    if path is None:
        path = [source]
    if source == destination:
        yield path
    for next_node in set(theGraph[source].keys()) :
        yield from dfs(next_node, destination, path + [next_node])


def main():
    paths = dfs('start', 'end')
    print_path(paths)
    print(sum(1 for _ in paths))

if __name__ == '__main__':
    main()